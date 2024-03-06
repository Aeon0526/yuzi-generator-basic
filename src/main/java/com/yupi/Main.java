package com.yupi;

import com.yupi.cli.CommandExecutor;

public class Main {
	public static void main(String[] args) {

		// 模拟输入
//		args = new String[]{"generate","-l","-a","-o"};

		// 打印对象配置信息
//		args = new String[]{"config"};

		// 生成模板文件所在路径
//		args = new String[]{"list"};


		CommandExecutor commandExecutor = new CommandExecutor();
		commandExecutor.doExecute(args);
	}
}
