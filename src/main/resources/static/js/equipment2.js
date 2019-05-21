$(function(){
	
	var surl1 = ipPort + "/positions/pname"
	,surl2 = ipPort + "/positions/enumber"
	,smurl = ipPort + "/monitorData/current"
	,ydata 
	,starder12 = 15,starder13 = 25
	,starder22 = 225,starder23 = 250
	,starder32 = 75,starder33 = 85
	,params = ['1-param-1','1-param-2','1-param-2'
		,'2-param-1','2-param-2','2-param-2'
		,'3-param-1','3-param-2','3-param-2'];

	$.ajax({
   		type: "get",
//   		url: surl2 ,
   		url: '',
   		data: {"enumber":"1-1-1"},
   		async:false,
   		contentType: "application/x-www-form-urlencoded",
   		dataType: "json",	       	     
   		success: function(jsonData){
   			console.log(jsonData);
   			console.log(jsonData);
   			var data = jsonData['_embedded']['positions'];
   			if( data ){     
   				$.each( data,function( index, item){
   					if( item["pname"] == '1-param-1'){
   						starder12 = item["gvalue"];
	   					starder13 = item["lvalue"];
   					}else if(item["pname"] == '1-param-2'){
   						starder22 = item["gvalue"];
	   					starder23 = item["lvalue"];
   					}else if(item["pname"] == '1-param-3'){
   						starder32 = item["gvalue"];
	   					starder33 = item["lvalue"];
   					}	   					
   				} )
   			}else{
   				console.log('请求失败或者数据为空');
   			}
   			console.log( '-----------starder12-----------');
   			console.log( starder12 );
   			console.log( '-----------starder13-----------');
   			console.log( starder13 );
   		},
   	    error:function(){
   	    }		       
	});
	
	
	
	
	var myChart1 = echarts.init( $('#param1')[0] )
	,myChart2 = echarts.init( $('#param2')[0] )
	,myChart3 = echarts.init( $('#param3')[0] );
	
	var option1 = {
		    title: {
		        text: '电流值实时监控',
//		        subtext: '纯属虚构'
		    },
		    tooltip: {
		        trigger: 'axis',
		        axisPointer: {
		            type: 'cross',
		            label: {
		                backgroundColor: '#283b56'
		            }
		        }
		    },
		    legend: {
		        data:['上限值', '下限值', '实际瞬时值']
		    },
		    toolbox: {
		        show: true,
		        feature: {
		            dataView: {readOnly: false},
		            restore: {},
		            saveAsImage: {}
		        }
		    },
		    dataZoom: {
		        show: false,
		        start: 0,
		        end: 100
		    },
		    xAxis: [
		        {
		            type: 'category',
		            boundaryGap: true,
		            data: (function (){
		                var now = new Date();
		                var res = [];
		                var len = 10;
		                while (len--) {
		                    res.unshift(now.toLocaleTimeString().replace(/^\D*/,''));
		                    now = new Date(now - 2000);
		                }
		                return res;
		            })()
		        },
		        {
		            type: 'category',
		            boundaryGap: true,
		            data: (function (){
		                var res = [];
		                var len = 10;
		                while (len--) {
		                    res.push(10 - len - 1);
		                }
		                return res;
		            })()
		        }
		    ],
		    yAxis: [
		        {
		            type: 'value',
		            scale: true,
		            name: '电流值',
		            max: 30,
		            min: 0,
		            boundaryGap: [0.2, 0.2]
		        },
		        {
		            type: 'value',
		            scale: true,
		            name: '电流值',
		            max: 30,
		            min: 0,
		            boundaryGap: [0.2, 0.2]
		        }
		    ],
		    series: [
		        {
		            name:'实际瞬时值',
		            type:'bar',
		            xAxisIndex: 1,
		            yAxisIndex: 1,
		            data:(function (){
		                var res = [];
		                var len = 10;
		                while (len--) {
		                    res.push(starder13+0.1);
		                }
		                return res;
		            })()
		        },
		        {
		            name:'上限值',
		            type:'line',
		            data:(function (){
		                var res = [];
		                var len = 0;
		                while (len < 10) {
		                    res.push( starder12 );
		                    len++;
		                }
		                return res;
		            })()
		        },
		        {
		            name:'下限值',
		            type:'line',
		            data:(function (){
		                var res = [];
		                var len = 0;
		                while (len < 10) {
		                    res.push(starder13);
		                    len++;
		                }
		                return res;
		            })()
		        }
		    ]
		};

	var option2 = {
		    title: {
		        text: '电压值实时监控',
//		        subtext: '纯属虚构'
		    },
		    tooltip: {
		        trigger: 'axis',
		        axisPointer: {
		            type: 'cross',
		            label: {
		                backgroundColor: '#283b56'
		            }
		        }
		    },
		    legend: {
		        data:['上限值', '下限值', '实际瞬时值']
		    },
		    toolbox: {
		        show: true,
		        feature: {
		            dataView: {readOnly: false},
		            restore: {},
		            saveAsImage: {}
		        }
		    },
		    dataZoom: {
		        show: false,
		        start: 0,
		        end: 100
		    },
		    xAxis: [
		        {
		            type: 'category',
		            boundaryGap: true,
		            data: (function (){
		                var now = new Date();
		                var res = [];
		                var len = 10;
		                while (len--) {
		                    res.unshift(now.toLocaleTimeString().replace(/^\D*/,''));
		                    now = new Date(now - 2000);
		                }
		                return res;
		            })()
		        },
		        {
		            type: 'category',
		            boundaryGap: true,
		            data: (function (){
		                var res = [];
		                var len = 10;
		                while (len--) {
		                    res.push(10 - len - 1);
		                }
		                return res;
		            })()
		        }
		    ],
		    yAxis: [
		        {
		            type: 'value',
		            scale: true,
		            name: '电压值',
		            max: 270,
		            min: 210,
		            boundaryGap: [0.2, 0.2]
		        },
		        {
		            type: 'value',
		            scale: true,
		            name: '电压值',
		            max: 270,
		            min: 210,
		            boundaryGap: [0.2, 0.2]
		        }
		    ],
		    series: [
		        {
		            name:'实际瞬时值',
		            type:'bar',
		            xAxisIndex: 1,
		            yAxisIndex: 1,
		            data:(function (){
		                var res = [];
		                var len = 10;
		                while (len--) {
		                    res.push(starder23+0.1);
		                }
		                return res;
		            })()
		        },
		        {
		            name:'上限值',
		            type:'line',
		            data:(function (){
		                var res = [];
		                var len = 0;
		                while (len < 10) {
		                    res.push( starder22 );
		                    len++;
		                }
		                return res;
		            })()
		        },
		        {
		            name:'下限值',
		            type:'line',
		            data:(function (){
		                var res = [];
		                var len = 0;
		                while (len < 10) {
		                    res.push(starder23);
		                    len++;
		                }
		                return res;
		            })()
		        }
		    ]
		};
	
	var option3 = {
		    title: {
		        text: '功率值实时监控',
//		        subtext: '纯属虚构'
		    },
		    tooltip: {
		        trigger: 'axis',
		        axisPointer: {
		            type: 'cross',
		            label: {
		                backgroundColor: '#283b56'
		            }
		        }
		    },
		    legend: {
		        data:['上限值', '下限值', '实际瞬时值']
		    },
		    toolbox: {
		        show: true,
		        feature: {
		            dataView: {readOnly: false},
		            restore: {},
		            saveAsImage: {}
		        }
		    },
		    dataZoom: {
		        show: false,
		        start: 0,
		        end: 100
		    },
		    xAxis: [
		        {
		            type: 'category',
		            boundaryGap: true,
		            data: (function (){
		                var now = new Date();
		                var res = [];
		                var len = 10;
		                while (len--) {
		                    res.unshift(now.toLocaleTimeString().replace(/^\D*/,''));
		                    now = new Date(now - 2000);
		                }
		                return res;
		            })()
		        },
		        {
		            type: 'category',
		            boundaryGap: true,
		            data: (function (){
		                var res = [];
		                var len = 10;
		                while (len--) {
		                    res.push(10 - len - 1);
		                }
		                return res;
		            })()
		        }
		    ],
		    yAxis: [
		        {
		            type: 'value',
		            scale: true,
		            name: '功率值',
		            max: 115,
		            min: 55,
		            boundaryGap: [0.2, 0.2]
		        },
		        {
		            type: 'value',
		            scale: true,
		            name: '功率值',
		            max: 115,
		            min: 55,
		            boundaryGap: [0.2, 0.2]
		        }
		    ],
		    series: [
		        {
		            name:'实际瞬时值',
		            type:'bar',
		            xAxisIndex: 1,
		            yAxisIndex: 1,
		            data:(function (){
		                var res = [];
		                var len = 10;
		                while (len--) {
		                    res.push(starder33+0.1);
		                }
		                return res;
		            })()
		        },
		        {
		            name:'上限值',
		            type:'line',
		            data:(function (){
		                var res = [];
		                var len = 0;
		                while (len < 10) {
		                    res.push( starder32 );
		                    len++;
		                }
		                return res;
		            })()
		        },
		        {
		            name:'下限值',
		            type:'line',
		            data:(function (){
		                var res = [];
		                var len = 0;
		                while (len < 10) {
		                    res.push(starder33);
		                    len++;
		                }
		                return res;
		            })()
		        }
		    ]
		};
	
	
		var number = 11;
		var timer1 = setInterval(function (){
		    axisData = (new Date()).toLocaleTimeString().replace(/^\D*/,'');

		    var data11 = option1.series[0].data;
		    var data12 = option1.series[1].data;
		    var data13 = option1.series[2].data;
		    
		    var data21 = option2.series[0].data;
		    var data22 = option2.series[1].data;
		    var data23 = option2.series[2].data;
		    
		    var data31 = option3.series[0].data;
		    var data32 = option3.series[1].data;
		    var data33 = option3.series[2].data;
		    
		    data11.shift();
		    data11.push(Math.round(Math.random() * 13) + 15 );
		    data12.shift();
		    data12.push(15);
		    data13.shift();
		    data13.push(25);
		    
		    data21.shift();
		    data21.push(Math.round(Math.random() * 27) + 225);
		    data22.shift();
		    data22.push(225);
		    data23.shift();
		    data23.push(250);
		    
		    data31.shift();
		    data31.push(Math.round(Math.random() * 13) + 75 );
		    data32.shift();
		    data32.push(75);
		    data33.shift();
		    data33.push(95);

//		    ajax( 'get', '', {"params": params}, function( data ){
//		    	data11.shift();
//			    data11.push( data['1-param-1']);
//			    data12.shift();
//			    data12.push(starder12);
//			    data13.shift();
//			    data13.push(starder13);
//			    
//			    data21.shift();
//			    data21.push( data['1-param-2']);
//			    data22.shift();
//			    data22.push(starder22);
//			    data23.shift();
//			    data23.push(starder23);
//			    
//			    data31.shift();
//			    data31.push( data['1-param-3']);
//			    data32.shift();
//			    data32.push(data32);
//			    data33.shift();
//			    data33.push(data33);
//		    }, false  );

		    option1.xAxis[0].data.shift();
		    option1.xAxis[0].data.push(axisData);
		    option1.xAxis[1].data.shift();
		    option1.xAxis[1].data.push(number++);
		    option2.xAxis[0].data.shift();
		    option2.xAxis[0].data.push(axisData);
		    option2.xAxis[1].data.shift();
		    option2.xAxis[1].data.push(number++);
		    option3.xAxis[0].data.shift();
		    option3.xAxis[0].data.push(axisData);
		    option3.xAxis[1].data.shift();
		    option3.xAxis[1].data.push(number++);

		    myChart1.setOption(option1);
		    myChart2.setOption(option2);
		    myChart3.setOption(option3);
		}, 2100);
		
		
})