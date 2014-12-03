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
		<id>${titleMap['订单号：']}</id>
		<changbian>${titleMap['供应商：']}</changbian>
		<#if titleMap['订单号：']??>
		<kehudanhao>${titleMap['订单号：']}</kehudanhao>
		<#else>
		<kehudanhao></kehudanhao>
		</#if>
		<#if titleMap['订单日期：']??>
		<riqi>${titleMap['订单日期：']}</riqi>
		<#else>
		<riqi></riqi>
		</#if>
		<#if titleMap['预定收货日期：']??>
		<daohuoriqi>${titleMap['预定收货日期：']}</daohuoriqi>
		<#else>
		<daohuoriqi></daohuoriqi>
		</#if>
		<#if titleMap['送货地址']??>
		<dizhi>${titleMap['送货地址']}</dizhi>
		<#else>
		<dizhi></dizhi>
		</#if>
	</xsdingdanzhubiao>
	<#if order.ordersItemList??>
	<#assign productList = order.ordersItemList/>
	<#list productList as product>
	<xsdingdanzibiao>
		<zhubiaoid>${product['订单号：']}</zhubiaoid>
		<huohao>${product['货号']}</huohao>
		<tiaoxingma>${product['条目号']}</tiaoxingma>
		<shangpinmiaoshu>${product['货品描述']}</shangpinmiaoshu>
		<shuliang>${product['订货数']}</shuliang>
		<huansuanlv1></huansuanlv1>
		<xiangshu>${product['箱含量']}</xiangshu>
		<hanshuidanjia></hanshuidanjia>
		<hanshuijine></hanshuijine>
		<buhanshuidanjia>${product['未税进价']}</buhanshuidanjia>
		<buhanshuijine></buhanshuijine>
		<shuilv></shuilv>
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