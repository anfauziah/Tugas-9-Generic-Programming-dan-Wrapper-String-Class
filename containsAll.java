public boolean containsAll( Collection<?> c ) {

	Iterator<?> e = c.iterator();
	while ( e.hasNext() )
	// does this collection contain the
	// next element from c?
	if( !contains( e.next() ) )
	// nope, c has an element we don’t have
	return false;
	return true; // yep, we have all the elements c has