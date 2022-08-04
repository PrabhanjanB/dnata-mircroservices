package com.emirates.dnata.awbservice.rabbitmq.message;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AWBServiceMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String awbPrefix;
	private String awbNumber;
	private String awbNature;
	private String origin;
	private String destination;
	private int pieces;
	private double weight;
	private String awbStatus;
	
	
	
	
}
