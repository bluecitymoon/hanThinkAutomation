<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <zhongduanxiaoliangdaorudanju  xmlns="http://HanThink.com/">
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
		<#if titleMap['orderDate']??>
		<riqi>${titleMap['orderDate']}</riqi>
		<#else>
		<riqi></riqi>
		</#if>
		<changbian>${titleMap['supplierNumber']}</changbian>
		<mendian>${titleMap['storeNumber']}</mendian>
		<bianhao></bianhao>
	</xsdingdanzhubiao>
	<#if order.ordersItemList??>
	<#assign productList = order.ordersItemList/>
	<#list productList as product>
	<xsdingdanzibiao>
		<zhubiaoid>${product['uuid']}</zhubiaoid>
		<huohao>${product['productNumber']}</huohao>
		<tiaoxingma></tiaoxingma>
		<shangpinmiaoshu>${product['description']}</shangpinmiaoshu>
		<xiaoshoushuliang>${product['count']}</xiaoshoushuliang>
		<xiaoshoujine>${product['moneyAmountWithoutTax']}</xiaoshoujine>
		<dangrikucun>${product['dayBalanceInDb']}</dangrikucun>
	</xsdingdanzibiao>
	</#list>
	</#if>
	</#list>
</NewDataSet>      		
		]]>
       </danjuxml>
    </zhongduanxiaoliangdaorudanju>
  </soap:Body>
</soap:Envelope>