package org.eulerdiagrams.vennom.graph;
import java.util.*;

/**
/**
/**
	protected String label = "";
/** The last generated shape object for this node */
/** The animation X distance on each iteration. */

/** Minimal constructor. It creates an unlabeled node. */
/** Creates a labelled node */
/** Creates a node at the given point. */

/** Creates a node of the given type. */
/** Creates a labeled node of the given type. */
/** Creates a node of the given type at the given point. */
/** Creates a labeled node at the given point. */
/** Creates a labelled node of the given type at the given point. */

	public ArrayList<Edge> getEdgesFrom() {return edgesFrom;}
	public void setLabel(String inLabel) {label=inLabel;}
/** Set the X part of the node centre only. */

/** Set the Y part of the node centre only and animate the changes. */

/**

		for(Edge e : edgesTo) {
		return ret;
/**

/**
	public HashSet<Node> unvisitedConnectingNodes() {
		HashSet<Node> nodes = new HashSet<Node>(degree());
		return(nodes);



/** Gives the number of connecting edges. */
/**
		int height = type.getHeight();