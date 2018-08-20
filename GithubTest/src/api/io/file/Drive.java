package api.io.file;

import java.io.File;

public class Drive {
	private String name;
	private long total;
	private long free;
	private long using;
	private File file;
	public Drive(String name,File file) throws Exception {
		this.name=name;
		this.file=file;
		if(!file.isDirectory()) 
			throw new Exception("폴더가 아닙니다.");
			
			this.total=file.getTotalSpace();
			this.free=file.getFreeSpace();
			this.using=this.total-this.using;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public long getFree() {
		return free;
	}
	public void setFree(long free) {
		this.free = free;
	}
	public long getUsing() {
		return using;
	}
	public void setUsing(long using) {
		this.using = using;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Drive[name="+this.getName()+"total space = "+this.getTotal()+"free space = "+this.getFree()+"]";
	}
	
}
