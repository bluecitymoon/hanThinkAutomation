<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <daorudanju xmlns="http://HanThink.com/">
      <dengluming>${htUsername}</dengluming>
      <denglumima>${htPassword}</denglumima>
      <zhangtaoming>${htDbName}</zhangtaoming>
      <danjuxml>
      <![CDATA[
      		<?xml version="1.0" standalone="yes"?>
      		<NewDataSet>
			<#list orders as order>
				<#assign titleMap = order.orderTitleMap/>
				<xsdingdanzhubiao>
					<id>${titleMap['id']}</id>
					<changbian></changbian>
					<#if titleMap['�����ţ�']??>
						<kehudanhao>${titleMap['�����ţ�']}</kehudanhao>
					<#else>
						<kehudanhao></kehudanhao>	
					</#if>
					<#if titleMap['�������ڣ�']??>
						<riqi>${titleMap['�������ڣ�']}</riqi>
					<#else>
						<riqi></riqi>	
					</#if>
					<#if titleMap['Ԥ���ջ����ڣ�']??>
						<daohuoriqi>${titleMap['Ԥ���ջ����ڣ�']}</daohuoriqi>
					<#else>
						<daohuoriqi></daohuoriqi>	
					</#if>
					<dizhi></dizhi>
				</xsdingdanzhubiao>
				<#if order.ordersItemList??>
				<#assign productList = order.ordersItemList/>
					<#list productList as product>
						<xsdingdanzibiao>
							<zhubiaoid>${product['id']}</zhubiaoid>
							<huohao>${product['��Ʒ��']}</huohao>
							<tiaoxingma></tiaoxingma>
							<shangpinmiaoshu>${product['��Ʒ����']}</shangpinmiaoshu>
							<shuliang>${product['��������']}</shuliang>
							<huansuanlv1></huansuanlv1>
							<xiangshu></xiangshu>
							<hanshuidanjia></hanshuidanjia>
							<hanshuijine></hanshuijine>
							<buhanshuidanjia>${product['����']}</buhanshuidanjia>
							<buhanshuijine>${product['���']}</buhanshuijine>
							<shuilv>${product['˰��']}</shuilv>
						</xsdingdanzibiao>
					</#list>
				</#if>
			</#list>
			</NewDataSet>
		]]>
       </danjuxml>
    </daorudanju>
  </soap:Body>
</soap:Envelope>