<template>
	<view class="content">
		<form class="app-update-pv">
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#A27DE3","textAlign":"left"}' class="title">
					教室名称</view>
				<input disabled
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#A27DE3","borderRadius":"0px","color":"#A27DE3","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.jiaoshiName" v-model="jiaoshi.jiaoshiName" placeholder="教室名称"></input>
			</view>
			<view
				:style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#A27DE3","textAlign":"left"}' class="title">
					教室图片</view>
				<view class="right-input" style="padding:0;textAlign:left">
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-if="jiaoshi.jiaoshiPhoto" :src="jiaoshi.jiaoshiPhoto" mode="aspectFill">
					</image>
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#A27DE3","textAlign":"left"}' class="title">
					教室类型</view>
				<input disabled
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#A27DE3","borderRadius":"0px","color":"#A27DE3","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.jiaoshiValue" v-model="jiaoshi.jiaoshiValue" placeholder="教室类型"></input>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#A27DE3","textAlign":"left"}' class="title">
					教室地点</view>
				<input disabled
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#A27DE3","borderRadius":"0px","color":"#A27DE3","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.jiaoshiAddress" v-model="jiaoshi.jiaoshiAddress" placeholder="教室地点"></input>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#A27DE3","textAlign":"left"}' class="title">
					楼层</view>
				<input disabled
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#A27DE3","borderRadius":"0px","color":"#A27DE3","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.loucengValue" v-model="jiaoshi.loucengValue" placeholder="楼层"></input>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#A27DE3","textAlign":"left"}' class="title">
					教室状态</view>
				<input disabled
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#A27DE3","borderRadius":"0px","color":"#A27DE3","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.jiaoshiOrderValue" v-model="jiaoshi.jiaoshiOrderValue" placeholder="教室状态"></input>
			</view>
			<!-- 级联表的表id -->
			<input type="hidden" :value="jiaoshi.id" id="jiaoshiId" name="jiaoshiId" />
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#A27DE3","textAlign":"left"}' class="title">
					购买的座位</view>
				<input disabled
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#A27DE3","borderRadius":"0px","color":"#A27DE3","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.buyZuoweiNumber" type="text" v-model="ruleForm.buyZuoweiNumber"
					placeholder="购买的座位"></input>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#A27DE3","textAlign":"left"}' class="title">
					订购日期</view>
				<input
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#A27DE3","borderRadius":"0px","color":"#A27DE3","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					v-model="ruleForm.buyZuoweiTime" placeholder="订购日期" :readonly="ro.buyZuoweiTime"
					@tap="toggleTab('buyZuoweiTime')"></input>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#A27DE3","textAlign":"left"}' class="title">
					使用状态</view>
				<picker @change="jiaoshiOrderTypesChange" :value="jiaoshiOrderTypesIndex"
					:range="jiaoshiOrderTypesOptions" range-key="indexName">
					<view
						:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#A27DE3","borderRadius":"0px","color":"#A27DE3","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
						class="uni-input">{{ruleForm.jiaoshiOrderTypes?ruleForm.jiaoshiOrderValue:"请选择使用状态"}}</view>
				</picker>
			</view>

			<view class="btn">
				<button
					:style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#A27DE3","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
					@tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="date" step="1" :current="false" :hasSecond="false" @confirm="buyZuoweiTimeConfirm"
			ref="buyZuoweiTime" themeColor="#333333"></w-picker>
		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="insertTimeConfirm"
			ref="insertTime" themeColor="#333333"></w-picker>
		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
			ref="createTime" themeColor="#333333"></w-picker>


	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross: '',
				ro: {
					jiaoshiId: false,
					yonghuId: false,
					buyZuoweiNumber: true,
					buyZuoweiTime: true,
					jiaoshiOrderTypes: false,
					insertTime: false,
					createTime: false,
				},
				ruleForm: {
					jiaoshiId: '',
					yonghuId: '',
					buyZuoweiNumber: '',
					buyZuoweiTime: '',
					jiaoshiOrderTypes: '', //数字
					jiaoshiOrderValue: '', //数字对应的值
					insertTime: '',
					createTime: '',
				},
				// 登陆用户信息
				user: {},
				jiaoshiOrderTypesOptions: [],
				jiaoshiOrderTypesIndex: 0,

			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {

			/*下拉框*/
			let jiaoshiOrderTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'jiaoshi_order_types',
			}
			let jiaoshiOrderTypes = await this.$api.page(`dictionary`, jiaoshiOrderTypesParams);
			this.jiaoshiOrderTypesOptions = jiaoshiOrderTypes.data.list


			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				let res = await this.$api.info(`jiaoshiOrder`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			if (options.jiaoshiOrderId) {
				this.ruleForm.jiaoshiOrderId = options.jiaoshiOrderId;
			}
			// 跨表
			// this.styleChange()
		},
		methods: {
			// 下拉变化
			jiaoshiOrderTypesChange(e) {
				this.jiaoshiOrderTypesIndex = e.target.value
				this.ruleForm.jiaoshiOrderValue = this.jiaoshiOrderTypesOptions[this.jiaoshiOrderTypesIndex].indexName
				this.ruleForm.jiaoshiOrderTypes = this.jiaoshiOrderTypesOptions[this.jiaoshiOrderTypesIndex].codeIndex
			},


			// styleChange() {
			// 	this.$nextTick(() => {
			// 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
			// 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
			// 		// })
			// 	})
			// },


			// 日期控件
			buyZuoweiTimeConfirm(val) {
				console.log(val)
				this.ruleForm.buyZuoweiTime = val.result;
				this.$forceUpdate();
			},
			// 日期控件
			insertTimeConfirm(val) {
				console.log(val)
				this.ruleForm.insertTime = val.result;
				this.$forceUpdate();
			},
			// 日期控件
			createTimeConfirm(val) {
				console.log(val)
				this.ruleForm.createTime = val.result;
				this.$forceUpdate();
			},




			getUUID() {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if ((!this.ruleForm.buyZuoweiNumber)) {
					this.$utils.msg(`购买的座位不能为空`);
					return
				}
				if ((!this.ruleForm.buyZuoweiTime)) {
					this.$utils.msg(`订购日期不能为空`);
					return
				}
				if (this.ruleForm.id) {
					await this.$api.update(`jiaoshiOrder`, this.ruleForm);
				} else {
					await this.$api.save(`jiaoshiOrder`, this.ruleForm);
				}
				uni.setStorageSync('pingluenStateState', true);
				this.$utils.msgBack('提交成功');
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}

	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}

	.cu-form-group.active {
		justify-content: space-between;
	}

	.btn {
		display: flex;
		align-items: center;
		justify-content: center;
		flex-wrap: wrap;
		padding: 20upx 0;
	}

	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}

	.cu-form-group+.cu-form-group {
		border: 0;
	}

	.cu-form-group uni-input {
		padding: 0 30upx;
	}

	.uni-input {
		padding: 0 30upx;
	}

	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}

	.cu-form-group uni-picker::after {
		line-height: 68rpx;
	}

	.select .uni-input {
		line-height: 68rpx;
	}

	.input .right-input {
		line-height: 68rpx;
	}
</style>
