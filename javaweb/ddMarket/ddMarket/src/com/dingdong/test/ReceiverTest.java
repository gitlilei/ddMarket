package com.dingdong.test;
import static org.junit.Assert.*;
import org.junit.Test;

import com.dingdong.pojo.Receiver;
import com.dingdong.service.ReceiverService;
public class ReceiverTest {
	@Test
	public void addReceiveTest(){
		ReceiverService receiverService = new ReceiverService();
		Receiver receiver = new Receiver();
		receiver.setAddress("长沙理工大学");
		receiver.setName("ahs");
		receiver.setReceiverId(2);
		receiver.setTelephone("22222");
		receiver.setUserId(3);
		receiverService.addReceiver(receiver);
	}
	@Test
	public void deleteReceiveTest(){
		ReceiverService receiverService = new ReceiverService();
		receiverService.deleteReceiverByID("2");
	}
	@Test
	public void updateReceiveTest(){
		ReceiverService receiverService = new ReceiverService();
		Receiver receiver = new Receiver();
		receiver.setAddress("长沙理工大学");
		receiver.setName("ahdfsfs");
		receiver.setReceiverId(4);
		receiver.setTelephone("22222");
		receiver.setUserId(3);
		receiver.setReceiverId(2);
		receiverService.update(receiver);
	}
}
