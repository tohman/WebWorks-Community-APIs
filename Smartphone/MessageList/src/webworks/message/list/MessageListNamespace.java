/*
* Copyright 2011 Research In Motion Limited.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package webworks.message.list;

import net.rim.device.api.script.Scriptable;
import net.rim.device.api.script.ScriptableFunction;

public class MessageListNamespace extends Scriptable
{
	public static final String FIELD_ONITEMOPENED = "onItemOpened";
	public static final String FIELD_ONITEMMARKEDREAD = "onItemMarkedRead";
	public static final String FIELD_ONITEMMARKEDUNREAD = "onItemMarkedUnread";
	public static final String FIELD_ONITEMDELETED = "onItemDeleted";

	private MessageListInitFunction _initMessageList = null;
	private MessageListAddItemFunction _addItem = null;
	private MessageListGetItemFunction _getItem = null;
	private MessageListClearFunction _clearMessageList = null;
	private MessageListRemoveItemFunction _removeItem = null;
	private MessageListMarkReadFunction _markItemRead = null;
	
	private String _defaultNewImage = null;
	private String _defaultReadImage = null;
	
	private ScriptableFunction _onItemOpened = null;
	private ScriptableFunction _onItemMarkedRead = null;
	private ScriptableFunction _onItemMarkedUnread = null;
	private ScriptableFunction _onItemDeleted = null;
	

	 public MessageListNamespace()
	 {
			_initMessageList = new MessageListInitFunction(this);
			_addItem = new MessageListAddItemFunction(this);
			_getItem = new MessageListGetItemFunction();
			_clearMessageList = new MessageListClearFunction();
			_removeItem = new MessageListRemoveItemFunction();
			_markItemRead = new MessageListMarkReadFunction();
	 }

   public Object getField(String name) throws Exception
	 {
		  if (name.equals(MessageListInitFunction.NAME))
		  {
			   return _initMessageList;			
		  }
		  else if (name.equals(MessageListAddItemFunction.NAME))
		  {
			   return _addItem;			
		  }
		  else if (name.equals(MessageListGetItemFunction.NAME))
		  {
			   return _getItem;			
		  }
		  else if (name.equals(MessageListClearFunction.NAME))
		  {
			   return _clearMessageList;			
		  }
		  else if (name.equals(MessageListRemoveItemFunction.NAME))
		  {
			   return _removeItem;
		  }
		  else if (name.equals(MessageListMarkReadFunction.NAME))
		  {
			   return _markItemRead;
		  }
		  else if (name.equals(FIELD_ONITEMOPENED))
		  {
			   return _onItemOpened;			
		  }
		  else if (name.equals(FIELD_ONITEMMARKEDREAD))
		  {
			   return _onItemMarkedRead;			
		  }
		  else if (name.equals(FIELD_ONITEMMARKEDUNREAD))
		  {
			   return _onItemMarkedUnread;			
		  }
		  else if (name.equals(FIELD_ONITEMDELETED))
		  {
			   return _onItemDeleted;			
		  }
		  return super.getField(name);  
	 }
	 
	 public boolean putField(String field, Object value) throws Exception {
	
		if (field.equals(FIELD_ONITEMOPENED)) {
           _onItemOpened = (ScriptableFunction)value;	  
        }
		else if (field.equals(FIELD_ONITEMMARKEDREAD)) {
           _onItemMarkedRead = (ScriptableFunction)value;	  
        }
		else if (field.equals(FIELD_ONITEMMARKEDUNREAD)) {
           _onItemMarkedUnread = (ScriptableFunction)value;	  
        }
		else if (field.equals(FIELD_ONITEMDELETED)) {
           _onItemDeleted = (ScriptableFunction)value;	  
        }
		
		return super.putField(field, value);
    }
	 
	 public ScriptableFunction getOnItemOpened() {
		return _onItemOpened;
	 }
	 
	 public ScriptableFunction getOnItemMarkedRead() {
		return _onItemMarkedRead;
	 }
	 
	 public ScriptableFunction getOnItemMarkedUnread() {
		return _onItemMarkedUnread;
	 }
	 
	 public ScriptableFunction getOnItemDeleted() {
		return _onItemDeleted;
	 }
	 
	 public String getDefaultNewImage() {
		return _defaultNewImage;
	 }
	 
	 public String getDefaultReadImage() {
		return _defaultReadImage;
	 }
	 
	 public void setDefaultNewImage(String value) {
		 _defaultNewImage = value;
	 }
	 
	 public void setDefaultReadImage(String value) {
		 _defaultReadImage = value;
	 }
}
