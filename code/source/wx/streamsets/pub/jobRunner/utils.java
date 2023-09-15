package wx.streamsets.pub.jobRunner;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class utils

{
	// ---( internal utility methods )---

	final static utils _instance = new utils();

	static utils _newInstance() { return new utils(); }

	static utils _cast(Object o) { return (utils)o; }

	// ---( server methods )---




	public static final void sleep (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(sleep)>> ---
		// @sigtype java 3.5
		  IDataCursor idc = pipeline.getCursor();
		
		
		try{
		           //do what you want to do before sleeping
		           Thread.sleep(5000); //sleep for 1000 ms
		           //do what you want to do after sleeptig
		}
		catch(InterruptedException ie){
		           //If this thread was intrrupted by nother thread
		}
		
		idc.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

