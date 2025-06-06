<template>
    <view class="content">
        <form>
			<view class="cu-form-group">
                <view class="title">订座信息</view>
            </view>
            <view v-for="(item,index) in orderGoods " v-bind:key="index" class="cu-form-group">
                <image class="avator" :src="item.jiaoshiPhoto" mode=""></image>
                <view class="title" style="width: 75%;">
                    <view style="margin-top: -50rpx;">{{item.jiaoshiName}}</view>
                    <view>
						{{item.selected}}号
                    </view>
					<view>
						订座日期{{item.buyZuoweiTime}}
					</view>
                </view>
            </view>
        </form>
        <view class="padding" style="text-align: center;">
            <button @tap="onSubmitTap()" class="bg-red lg">确认</button>
        </view>
    </view>
</template>

<script>
    export default {
        data() {
            return {
                user: {},//登录用户
                orderGoods: [],//展示数据
                maxNewMouey: 0,//总价格
                jiaoshiOrderPaymentTypes:1,//是什么支付类型
                zhi:[
                    {
                        id:1,
                        val:"余额"
                    },
                    {
                        id:2,
                        val:"积分"
                    },
                ],
                zhekou:1,//折扣
            }
        },
        async onLoad(options) {
            // 获取订单信息，座位信息
            this.orderGoods = uni.getStorageSync('orderGoods');
            uni.removeStorageSync("orderGoods")
        },
        async onShow() {
            let _this = this
            let table = uni.getStorageSync("nowTable");
            let userRes = await _this.$api.session(table)
            _this.user = userRes.data

            let huiyuandengjiTypesRes = await _this.$api.page("dictionary",{
                dicCode: "huiyuandengji_types",
                dicName: "会员等级类型",
                codeIndexStart: _this.user.huiyuandengjiTypes,
                codeIndexEnd: _this.user.huiyuandengjiTypes,
            })
            if(huiyuandengjiTypesRes.data.list.length >0){
                _this.zhekou = huiyuandengjiTypesRes.data.list[0].beizhu;
            }


        },
        methods: {
            async onSubmitTap() {
                let _this = this;
                let table = uni.getStorageSync("nowTable");
                uni.showModal({
                    title: '提示',
                    content: '是否确认',
                    success: async function(res) {
                        if (res.confirm) {
							let order = {
								yonghuId: _this.user.id,
								jiaoshiId:  _this.orderGoods[0].jiaoshiId,
                                buyZuoweiNumber: _this.orderGoods[0].selected,
                                buyZuoweiTime: _this.orderGoods[0].buyZuoweiTime,
								jiaoshiOrderTypes:1
							}
							 _this.$utils.msg('预定成功');
							 await _this.$api.add('jiaoshiOrder', order);
                            _this.$utils.jump('/pages/jiaoshiOrder/list');
                        }
                    }
                });
            },
        }
    }
</script>

<style lang="scss">
    .avator {
        width: 150upx;
        height: 150upx;
        margin: 20upx 0;
    }
</style>
