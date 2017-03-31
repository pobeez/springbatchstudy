package com.example;

import com.example.calc.Calculator;
import com.example.calc.internal.SimpleScoreCalculatorImpl;
import com.example.payment.Payment;
import com.example.payment.PaymentMethod;
import com.example.payment.PaymentReceipt;

public class Main {

	public static void main(String[] args) {

		if(args.length < 2) {
			System.exit(1);
		}
		Parameter param = new ArgumentParser().parse(args);
		Payment result = new Main().execute(param);
		System.out.println(new PaymentReceipt(result).getReceipt());
	}
	
	public Payment execute(Parameter p) {
		Calculator calculator = new SimpleScoreCalculatorImpl();
		int score = calculator.calculate(p.code, p.hansu, p.tsumo, p.peace);
		return new PaymentMethod().getPayment(score, p.tsumo);
	}
}