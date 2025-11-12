<!-- Tập trung vào phần thêm mới -->
<script setup>
import { ref } from "vue";
//Khai báo đối tượng tác giả
const tacGia = ref({
  ten: "",
  gioiTinh: true,
  diaChi: "",
  tuoi: null,
});
//defineEmit để con them-tacgia cỏ thể phát sinh sự kiện lên cha
const emit = defineEmits(["them-gia"]);
//gọi hàm submit
const onSubmit = () => {
  emit("them-gia", { id: Date.now(), ...tacGia.value });
  tacGia.value = {
    ten: "",
    gioiTinh: true,
    diaChi: "",
    tuoi: null,
  };
};
</script>

<template>
  <div>
    <h3>Thêm tác giả</h3>
    <form @submit.prevent="onSubmit"> 
      <!--Lưu ý:  @submit.prevent="onSubmit" -->
      <div class="mb-3">
        <label>Tên: </label>
        <input type="text" class="form-control" v-model="tacGia.ten" required />
      </div>
      <div>
        <label>Giới tính:</label>
        <div class="form-check">
          <input
            v-model="tacGia.gioiTinh"
            class="form-check-input"
            type="radio"
            name="radioDefault"
          />
          <label class="form-check-label" for="radioDefault1"> Nam </label>
        </div>
        <div class="form-check">
          <input
            v-model="tacGia.gioiTinh"
            class="form-check-input"
            type="radio"
            checked
            name="radioDefault"
          />
          <label class="form-check-label" for="radioDefault2"> Nữ </label>
        </div>
      </div>
      <div class="mb-3">
        <label>Địa chỉ: </label>
        <input type="text" class="form-control" v-model="tacGia.diaChi" required />
      </div>
      <div class="mb-3">
        <label>Tuổi: </label>
        <input type="text" class="form-control" v-model.number="tacGia.tuoi" required />
      </div>
      <button type="submit" class="btn btn-primary">Add</button>
    </form>
  </div>
</template>
