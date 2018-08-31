package zjh.cloudladder.bean.devops;

public class ResourceFlavor {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getStorage() {
		return storage;
	}
	public void setStorage(Double storage) {
		this.storage = storage;
	}
	private String name;
	private String desc;
	private Double cpu;
	private Double memory;
	private Double disk;
	private Double storage;
	public Double getCpu() {
		return cpu;
	}
	public void setCpu(Double cpu) {
		this.cpu = cpu;
	}
	public Double getMemory() {
		return memory;
	}
	public void setMemory(Double memory) {
		this.memory = memory;
	}
	public Double getDisk() {
		return disk;
	}
	
	public void setDisk(Double disk) {
		this.disk = disk;
	}

}
