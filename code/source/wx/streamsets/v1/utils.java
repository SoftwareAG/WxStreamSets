package wx.streamsets.v1;

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




	public static final void sleepForFiveSeconds (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(sleepForFiveSeconds)>> ---
		// @sigtype java 3.5
		try {  
		   Thread.sleep(5000); //sleep for 5 seconds
		}
		catch(InterruptedException ie){
			throw new ServiceException(ie.getMessage());
		}
			
		// --- <<IS-END>> ---

                
	}
}

