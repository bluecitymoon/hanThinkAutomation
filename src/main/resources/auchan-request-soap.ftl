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
		<#if titleMap['预计收货日期：']??>
		<daohuoriqi>${titleMap['预计收货日期：']}</daohuoriqi>
		<#else>
		<daohuoriqi></daohuoriqi>
		</#if>
		<dizhi>${titleMap['门店名：']}</dizhi>
	</xsdingdanzhubiao>
	<#if order.ordersItemList??>
	<#assign productList = order.ordersItemList/>
	<#list productList as product>
	<xsdingdanzibiao>
		<zhubiaoid>${product['id']}</zhubiaoid>
		<huohao>${product['商品号']}</huohao>
		<tiaoxingma></tiaoxingma>
		<shangpinmiaoshu>${product['商品名称']}</shangpinmiaoshu>
		<shuliang>${product['订单数量']}</shuliang>
		<huansuanlv1></huansuanlv1>
		<xiangshu></xiangshu>
		<hanshuidanjia></hanshuidanjia>
		<hanshuijine></hanshuijine>
		<buhanshuidanjia>${product['单价']}</buhanshuidanjia>
		<buhanshuijine>${product['金额']}</buhanshuijine>
		<shuilv>${product['税率']}</shuilv>
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