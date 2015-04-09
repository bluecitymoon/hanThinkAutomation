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
		<id>${titleMap['uuid']}</id>
		<changbian>${titleMap['supplierNumber']}</changbian>
		<#if titleMap['orderNumber']??>
		<kehudanhao>${titleMap['orderNumber']}</kehudanhao>
		<#else>
		<kehudanhao></kehudanhao>
		</#if>
		<#if titleMap['orderDate']??>
		<riqi>${titleMap['orderDate']}</riqi>
		<#else>
		<riqi></riqi>
		</#if>
		<#if titleMap['estimateTakeOverDate']??>
		<daohuoriqi>${titleMap['estimateTakeOverDate']}</daohuoriqi>
		<#else>
		<daohuoriqi></daohuoriqi>
		</#if>
		<dizhi></dizhi>
	</xsdingdanzhubiao>
	<#if order.ordersItemList??>
	<#assign productList = order.ordersItemList/>
	<#list productList as product>
	<xsdingdanzibiao>
		<zhubiaoid>${product['uuid']}</zhubiaoid>
		<huohao>${product['productNumber']}</huohao>
		<tiaoxingma></tiaoxingma>
		<shangpinmiaoshu>${product['description']}</shangpinmiaoshu>
		<shuliang>${product['count']}</shuliang>
		<huansuanlv1></huansuanlv1>
		<xiangshu></xiangshu>
		<hanshuidanjia></hanshuidanjia>
		<hanshuijine></hanshuijine>
		<buhanshuijine>${product['moneyAmountWithoutTax']}</buhanshuijine>
		<buhanshuidanjia>${product['priceWithoutTax']}</buhanshuidanjia>
		<shuilv></shuilv>
		<zengpinbianma></zengpinbianma>
		<zengpinmiaoshu></zengpinmiaoshu>
		<zengpinshuliang></zengpinshuliang>
		<zibiaomendian>${product['storeNumber']}</zibiaomendian>
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