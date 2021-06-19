package IteratorPattern;

public class SkyworthTelevision implements Television {

	private Object[] obj= {"CCTV-1","CCTV-2","CCVT-3","CCTV-4","CCTV-5"};
	
	@Override
	public TVIterator createIterator() {
		
		return new SkyworthIterator();
	}
	private class SkyworthIterator implements TVIterator{
		private int currentIndex=0;
		public void next() {
			if(currentIndex<obj.length)
			{
				currentIndex++;
			}
		}
		@Override
		public void setChannel(int i) {
			currentIndex=i;
		}
		@Override
		public void previous() {
			if(currentIndex>0)
			{
				currentIndex--;
			}
		}
		@Override
		public boolean isLast() {
			
			return currentIndex==obj.length;
		}
		@Override
		public Object currentChannel() {
			return obj[currentIndex];
		}
		@Override
		public boolean isFirst() {
			return currentIndex==0;
		}
	}

}
