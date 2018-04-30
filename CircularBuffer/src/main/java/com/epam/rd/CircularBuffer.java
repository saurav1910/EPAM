/**
 * 
 */
package com.epam.rd;

import java.util.ArrayList;
import java.util.List;

import com.epam.rd.exception.BufferOverflowExcpetion;
import com.epam.rd.exception.BufferUnderFlowException;

/**
 * @author saura
 *
 */
public class CircularBuffer<T> {
	private List<T> buffer;
	private int front;
	private int rear;
	private int maxsize;
	private int size;

	public CircularBuffer(int maxsize) {
		buffer = new ArrayList<>(maxsize);
		this.maxsize = maxsize;
		front = rear = size = 0;
	}

	public void add(T data) throws BufferOverflowExcpetion {
		if (isFull()) {
			throw new BufferOverflowExcpetion("Buffer is full");
		}
		buffer.add(data);
		rear++;
		size++;
	}

	public T remove() {
		T data = null;
		if (isEmpty()) {
			new BufferUnderFlowException("Buffer is empty");
		} else {
			data = buffer.remove(front);
			front = (front + 1) % maxsize;
			size--;
		}
		return data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return maxsize == size;
	}

}