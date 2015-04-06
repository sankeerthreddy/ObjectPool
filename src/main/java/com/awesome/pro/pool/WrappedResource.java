package com.awesome.pro.pool;

/**
 * Represents a resource which can be pooled.
 * Created by sankeerth.reddy on 05/04/15.
 */
public interface WrappedResource<K> {

	/**
	 * Close the resource.
	 */
	void close();

	/**
	 * @return Whether the resource is already closed or not.
	 */
	boolean isClosed();

	/**
	 * @return Wrapped resource instance.
	 */
	K getResource();

}
