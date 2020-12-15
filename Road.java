/**
 * The class Road that can represent the edges of a Graph of Towns. Since this is a undirected graph, an edge from A to B is equal to an edge from B to A.
 * @author Justin Hixson
 *
 */
public class Road implements Comparable<Road> {

	private Town source, destination;
	private int degrees;
	private String name;
	/**
	 * Constructor
	 * @param source One town on the road
	 * @param destination Another town on the road
	 * @param degrees Weight of the edge, i.e., distance from one town to the other
	 * @param name Name of the road
	 */
	public Road(Town source, Town destination, int degrees, String name) {
		this.source = source;
		this.destination = destination;
		this.degrees = degrees;
		this.name = name;
	}
	/**
	 * Constructor with weight preset at 1
	 * @param source One town on the road
	 * @param destination Another town on the road
	 * @param name Name of the road
	 */
	public Road(Town source, Town destination, String name) {
		this.source = source;
		this.destination = destination;
		degrees = 1;
		this.name = name;
	}
	/**
	 * compare to method
	 * @return 0 if the road names are the same, a positive or negative number if the road names are not the same
	 */
	@Override
	public int compareTo(Road o) {
		if (o.getSource().equals(getSource()) && o.getDestination().equals(getDestination()))
			return 0;

		if (o.getDestination().equals(getSource()) && o.getSource().equals(getDestination()))
			return 0;
		return 1;
	}
	/**
	 * Returns true only if the edge contains the given town
	 * @param town a vertex of the graph
	 * @return true only if the edge is connected to the given vertex
	 */
	public boolean contains(Town town) {
		if (getSource().getName().equals(town.getName()))
			return true;
		if (getDestination().getName().equals(town.getName()))
			return true;
		return false;
	}
	/**
	 * Returns true if each of the ends of the road r is the same as the ends of this road
	 * @param r road object to compare it to
	 */
	public boolean equals(Object r) {
		if (r instanceof Road) {
			if (((Road) r).getSource().equals(getSource()) && ((Road) r).getDestination().equals(getDestination()))
				return true;

			if (((Road) r).getDestination().equals(getSource()) && ((Road) r).getSource().equals(getDestination()))
				return true;
		}
		return false;
	}
	/**
	 * Returns the second town on the road
	 * @return A town on the road
	 */
	public Town getDestination() {
		return destination;
	}
	/**
	 * Returns the road name
	 * @return The name of the road
	 */
	public String getName() {
		return name;
	}
	/**
	 * Returns the first town on the road
	 * @return A town on the road
	 */
	public Town getSource() {
		return source;
	}
	/**
	 * Returns the distance of the road
	 * @return the distance of the road
	 */
	public int getWeight() {
		return degrees;
	}
	/**
	 * To string method
	 * @return to string
	 */
	public String toString() {
		return getName() + "," + getWeight() + ";" + getSource() + ";" + getDestination();
	}
}
