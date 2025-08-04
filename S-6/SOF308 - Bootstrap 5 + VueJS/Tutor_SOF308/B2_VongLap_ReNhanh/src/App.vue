<script setup>
import { ref } from 'vue';

const listSanPham = ref([
  { id: 'SP01', ten: 'Laptop', },
  { id: 'SP02', ten: 'Dien Thoai', },
  { id: 'SP03', ten: 'Tai nghe', },
  { id: 'SP04', ten: 'May tinh bang', },
])

const listNhanVien = ref([
  { ma: 'NV01', ten: 'Nguyen Van A', bac: 1, tuoi: 25 },
  { ma: 'NV02', ten: 'Tran Van B', bac: 2, tuoi: 18 },
  { ma: 'NV03', ten: 'Le Van C', bac: 1, tuoi: 22 },
  { ma: 'NV04', ten: 'Pham Van D', bac: 3, tuoi: 18 },
])

function searchByName() {
  var keyword = searchKeyword.value.trim().toLowerCase();
  if (!keyword) {
    // k nhap gi
    listNhanVien.value = [...listCopy.value]
    return
  }
  //search
  listNhanVien.value = listCopy.value.filter((nv) => nv.ten.toLowerCase().includes(keyword))
}
</script>

<template>
  <div>
    <h1>Buoi 2 - Vong lap</h1>
  </div>

  <div>
    <h1>Bai 1</h1>

    <h3>Load Table</h3>
    <table class="table container">
      <thead>
        <tr>
          <th scope="col"># Index</th>
          <th scope="col">ID</th>
          <th scope="col">Ten</th>
        </tr>
      </thead>
      <tbody>
        <template v-for="(item, index) in listSanPham" :key="item.id">
          <tr>
            <td>{{ index + 1 }}</td>
            <td>{{ item.id }}</td>
            <td>{{ item.ten }}</td>
          </tr>
        </template>
      </tbody>
    </table>
    
    <h3>Load ul li</h3>
    <ul>
      <template v-for="item in listSanPham" :key="item.id">
        <li>{{ item.id }} - {{ item.ten }}</li>
      </template>
    </ul>

    <h3>Load Combobox - Select & Option</h3>
    <select class="form-select container" aria-label="Default select example">
      <template v-for="item in listSanPham" :key="item.id">
        <option :value="item.id">{{ item.ten }}</option>
      </template>
    </select>
  </div>
  
  <div>
    <h3>Load List Nhan Vien</h3>
    <table class="table container">
      <thead>
        <tr>
          <th>#</th>
          <th>Ma</th>
          <th>Ten</th>
          <th>Bac</th>
          <th>Tuoi</th>
        </tr>
      </thead>
      <tbody>
        <template v-for="(item, index) in listNhanVien" :key="item.ma">
          <tr>
            <td>{{ index + 1 }}</td>
            <td>{{ item.ma }}</td>
            <td>{{ item.ten }}</td>
            <td>{{ item.bac }}</td>
            <td>{{ item.tuoi }}</td>
          </tr>
        </template>
      </tbody>
    </table>

    <h3>Nhung NV co tuoi > 20</h3>
    <ul>
      <template v-for="item in listNhanVien" :key="item.ma">
        <li v-if="item.tuoi > 20">{{ item.ten }} - Bac: {{ item.bac }} - {{ item.tuoi }} tuoi</li>
      </template>
    </ul>

    <h3>Search by TenNV</h3>
    <label for="search" class="form-label">Search by Name</label>
    <input type="text" class="form-control" placeholder="Ten NV" v-model="searchKeyword">
    <button @click="searchByName" class="btn btn-outline-success">Search</button>
  </div>
</template>
<!-- 
Nhan Vien
ma - String
ten - String
bac - Number
tuoi - Number
1. Load du lieu len Table
2. Loc danh sach nhung nhan vien > 20t
3. Tao button Search, o Input search theo ten
-->

<style scoped>
h1 {
  text-align: center;
}
</style>
