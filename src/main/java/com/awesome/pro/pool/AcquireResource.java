package com.awesome.pro.pool;

/**
 * Functional interface to acquire a new resource.
 * Created by sankeerth.reddy on 04/04/15.
 * @param <K> TGeneric type of the resource to be acquired.
 */
public interface AcquireResource<K extends com.awesome.pro.pool.WrappedResource<?>> {

	/**
	 * @return New resource acquired.
	 */
	K acquireResource();

}
