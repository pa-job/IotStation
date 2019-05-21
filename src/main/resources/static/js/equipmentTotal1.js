$(function(){
	
	
	var option1 = {
			 title: {
			        text: '电流累计值',
//			        subtext: '纯属虚构'
			    },
		    color: ['#3398DB'],
		    tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    grid: {
		        left: '3%',
		        right: '4%',
		        bottom: '3%',
		        containLabel: true
		    },
		    xAxis : [
		        {
		            type : 'category',
		            data : ['1', '2', '3', '4', '5', '6', '7','8', '9', '10','11','12','13', '14', '15', '16', '17','18', '19', '20','21','22','23', '24', '25', '26', '27', '28', '29','30', '31'],
		            axisTick: {
		                alignWithLabel: true
		            }
		        }
		    ],
		    yAxis : [
		        {
		            type : 'value'
		        }
		    ],
		    series : [
		        {
		            name:'电流值',
		            type:'bar',
		            barWidth: '60%',
		            data:[10, 52, 200, 334, 390, 330, 220,110, 252, 200, 334, 90, 300, 220,109, 52, 220, 334, 190, 230, 220,100, 252, 250, 334, 350, 330, 220, 330, 330, 220]
		        }
		    ]
		}
	, option2 = {
			 title: {
			        text: '电压累计值',
//			        subtext: '纯属虚构'
			    },
		    color: ['red'],
		    tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    grid: {
		        left: '3%',
		        right: '4%',
		        bottom: '3%',
		        containLabel: true
		    },
		    xAxis : [
		        {
		            type : 'category',
		            data : ['1', '2', '3', '4', '5', '6', '7','8', '9', '10','11','12','13', '14', '15', '16', '17','18', '19', '20','21','22','23', '24', '25', '26', '27', '28', '29','30', '31'],
		            axisTick: {
		                alignWithLabel: true
		            }
		        }
		    ],
		    yAxis : [
		        {
		            type : 'value'
		        }
		    ],
		    series : [
		        {
		            name:'电压值',
		            type:'bar',
		            barWidth: '60%',
		            data:[10,220,109, 52, 220, 334, 190, 230, 220,100, 252, 250, 334, 350, 330, 220, 330, 330, 220, 334, 230, 52, 200, 334, 390, 330, 220,110, 252, 200,150]
		        }
		    ]
		}
	,option3 = {
		    color: ['yellow'],
		    tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    grid: {
		        left: '3%',
		        right: '4%',
		        bottom: '3%',
		        containLabel: true
		    },
		    xAxis : [
		        {
		            type : 'category',
		            data : ['1', '2', '3', '4', '5', '6', '7','8', '9', '10','11','12','13', '14', '15', '16', '17','18', '19', '20','21','22','23', '24', '25', '26', '27', '28', '29','30', '31'],
		            axisTick: {
		                alignWithLabel: true
		            }
		        }
		    ],
		    yAxis : [
		        {
		            type : 'value'
		        }
		    ],
		    series : [
		        {
		            name:'功率值',
		            type:'bar',
		            barWidth: '60%',
		            data:[ 334, 90, 300, 220,109, 52,10, 52, 200, 334, 390, 330, 220,110, 252, 200, 220, 334, 190, 230, 220,100,220,109, 52,10, 52, 200, 334, 390,330, 220, 334, 230, 130, 220, 390, 330, 270]
		        }
		    ]
		}
	var myChart1 = echarts.init( $('#param1')[0] )
	,myChart2 = echarts.init( $('#param2')[0] );
	
	myChart1.setOption(option1);
    myChart2.setOption(option2);
})