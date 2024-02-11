package com.yupi.cli.example;

import picocli.CommandLine;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

public class Login implements Callable<Integer> {
	@Option(names = {"-u", "--user"}, description = "User name")
	String user;

//	  // Picocli 默认输入密码
//    @Option(names = {"-p", "--password"}, description = "Passphrase", interactive = true)
//    String password;

	// 修改输入密码提示
	@Option(names = {"-p", "--password"}, description = "Passphrase", interactive = true, echo = false, prompt = "请输入密码：")
	String password;

	// 接收校验密码
	@Option(names = {"-cp", "--checkPassword"}, description = "Check Password", interactive = true, prompt = "请校验密码：")
	String checkPassword;

	public Integer call() throws Exception {
		System.out.println("password = " + password);
		System.out.println("checkPassword = " + checkPassword);
		return 0;
	}

	public static void main(String[] args) {
//		new CommandLine(new Login()).execute("-u", "user123", "-p");	// 只有输入密码，没有校验
		new CommandLine(new Login()).execute("-u", "user123", "-p", "-cp");// 输入密码，并校验
	}
}