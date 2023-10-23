package model.service;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		double parcelas = contract.getTotalValue()/months;
		
		for(int i = 1; i<=months ; i++) {
			LocalDate novaData = contract.getDate().plusMonths(i);
			double taxa = onlinePaymentService.interest(parcelas, i);
			double  juros = onlinePaymentService.paymentFee(taxa + parcelas);
			double parcelaTotal = juros + taxa + parcelas;
			contract.getInstallments().add(new Installment (novaData, parcelaTotal));
		}
	}
}