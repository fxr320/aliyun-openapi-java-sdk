/*
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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.ListWorkflowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWorkflowResponse extends AcsResponse {

	private String requestId;

	private List<WorkflowInfo> workflowInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<WorkflowInfo> getWorkflowInfoList() {
		return this.workflowInfoList;
	}

	public void setWorkflowInfoList(List<WorkflowInfo> workflowInfoList) {
		this.workflowInfoList = workflowInfoList;
	}

	public static class WorkflowInfo {

		private String workflowId;

		private String name;

		private String actionList;

		private String creationTime;

		private String modifyTime;

		public String getWorkflowId() {
			return this.workflowId;
		}

		public void setWorkflowId(String workflowId) {
			this.workflowId = workflowId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getActionList() {
			return this.actionList;
		}

		public void setActionList(String actionList) {
			this.actionList = actionList;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public ListWorkflowResponse getInstance(UnmarshallerContext context) {
		return	ListWorkflowResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
