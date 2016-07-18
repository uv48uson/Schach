package renderEngine;

public class RawModel {

	private int vaoID;
	private int vertexCount;
	
	public RawModel(int vaoID, int vertexCount){
		this.setVaoID(vaoID);
		this.setVertexCount(vertexCount);
	}

	private void setVertexCount(int vertexCount) {
		this.vertexCount = vertexCount;
	}

	private void setVaoID(int vaoID) {
		this.vaoID = vaoID;
	}

	public int getVaoID() {
		return vaoID;
	}

	public int getVertexCount() {
		return vertexCount;
	}
}
