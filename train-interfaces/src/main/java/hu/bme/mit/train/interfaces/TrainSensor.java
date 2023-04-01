package hu.bme.mit.train.interfaces;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;

public interface TrainSensor {

	int getSpeedLimit();

	void overrideSpeedLimit(int speedLimit);

	Table<Long, Integer, Integer> getTable();  

	void addToTable(long time, int jpos, int speed); 

}
