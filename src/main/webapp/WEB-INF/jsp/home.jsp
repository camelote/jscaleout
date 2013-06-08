<%@ include file="/WEB-INF/jsp/taglibs.jsp"%>

<s:layout-render name="/WEB-INF/jsp/layout.jsp" title="Welcome">
	<s:layout-component name="body">
		<p>Congratulations, you've set up a Stripes project!</p>
		<p>You are running Java version ${actionBean.javaVersion} on the
			${actionBean.osName} operating system.</p>
		<s:form beanclass="com.github.action.HomeActionBean">
			<table>
				<tbody>
					<tr>
						<td colspan="2">Enter Question: <s:text name="question"></s:text>
						</td>
					</tr>
					<tr>
						<td colspan="2"><s:submit name="doGetMsg" value="Submit"></s:submit>
						</td>
					</tr>
					<tr>
						<td colspan="2">Nombre de résultats: ${actionBean.nombreResultat }</td>
						<td>${actionBean.questionsTitles }</td>
					</tr>
				</tbody>
			</table>
		</s:form>
	</s:layout-component>
</s:layout-render>
