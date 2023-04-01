package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;



public class TrainSensorImpl implements TrainSensor {

	private TrainController controller;
	private TrainUser user;
	private int speedLimit = 5;
	Table<Long, Integer, Integer> tachograf = HashBasedTable.create(); 
	

	public TrainSensorImpl(TrainController controller, TrainUser user) {
		this.controller = controller;
		this.user = user;
	}

	@Override
	public int getSpeedLimit() {
		return speedLimit;
	}

	@Override
	public void overrideSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
		controller.setSpeedLimit(speedLimit);
	}

	public void addToTable(long t, int pos, int  s){
		tachograf.put(t,pos,s); 
	} 

	public Table<Long, Integer, Integer> getTable(){
		return tachograf; 
	}





}
