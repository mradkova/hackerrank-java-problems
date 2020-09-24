

public class TryWithResourcesTask implements AutoCloseable {
	
	public int divide(final int m, final int n) {
		return m / n;
	}

	@Override
	public void close() throws Exception {
		throw new RuntimeException("1");
	}

	public static void main(String[] args) throws Exception {
		Integer result = null;
		try (final TryWithResourcesTask resource = new TryWithResourcesTask()) {
			result = resource.divide(1, 0);
		} finally {
			if (result == null) {
				throw new RuntimeException("3");
			}
		}
	}
}
