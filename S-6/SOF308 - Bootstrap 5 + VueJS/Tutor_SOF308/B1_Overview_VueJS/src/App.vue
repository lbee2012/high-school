<!-- Cau truc cua mot file VUE
thanh phan:
Chua giao dien: template => html
Chua logic: script setup => js
Chua lam dep: style scoped => css
-->

<!-- SFC: Single File Component: mooix thuws vaof 1 file (HTML, CSS, JS) -->
<template>
  <div>
    <h1>Buoi 1 - Overview VueJS</h1>
    <!-- Cu phap noi suy van ban {{  }} -->
    Number: {{ number }}

    {{ button }}
  </div>
  <div>
    <!-- Nhung HTML: v-html -->
    <div v-html="button"></div>
    <div v-html="table"></div>
  </div>
  <div>
    <h1>Data Binding</h1>
    <!-- v-on: == @ -->
    <button v-on:click="click">click by v-on:</button>
    <button @click="click">click by @</button>
    <!-- v-bind: ==  -->
    <button v-bind:id="idButton" v-bind:class="classButton">click by v-bind</button>
    <button :id="idButton" :class="classButton">click by :</button>
  </div>
  <div>
    <h1>Nhung Bootstrap</h1>
    <h3>Co 3 cach de su dung bootstrap</h3>
    <h4>1. CDN</h4>
    <h4>2. NPM</h4> <!-- npm install bootstrap -->
    <h4>3. vue-bootstrap</h4>
    <h1>Bootstrap's styled button</h1>
    <button type="button" class="btn btn-primary">Primary</button>
    <button type="button" class="btn btn-secondary">Secondary</button>
    <button type="button" class="btn btn-success">Success</button>
    <button type="button" class="btn btn-danger">Danger</button>
    <button type="button" class="btn btn-warning">Warning</button>
    <button type="button" class="btn btn-info">Info</button>
    <button type="button" class="btn btn-light">Light</button>
    <button type="button" class="btn btn-dark">Dark</button>

    <button type="button" class="btn btn-link">Link</button>
  </div>
  <div>
    <h1>Ref & Reactive</h1>
    <div>
      <h3>Bai 1: Thong tin Sinh vien</h3>
      <p>Ma: {{ sinhVien.ma }}</p>
      <p>Ten: {{ sinhVien.ten }}</p>
      <p>Tuoi: {{ sinhVien.tuoi }}</p>
      <p>Gioi tinh: {{ sinhVien.gioiTinh == true ? 'Nam' : 'Nu'}}</p>
      <p>Dia chi: {{ sinhVien.diaChi }}</p>
    </div>

    <div>
      <h3>Bai 2: Thong tin May tinh</h3>
      <p>Ma: {{ mayTinh.ma }}</p>
      <p>Ten: {{ mayTinh.ten }}</p>
      <p>Mau sac: {{ mayTinh.mauSac }}</p>
      <p>Gia: {{ mayTinh.gia }}</p>
      <p>Ngay san xuat: {{ mayTinh.ngaySanXuat }}</p>
    </div>
  </div>
  <div>
    <h1>V-Model</h1>
    <div>
      <h3>Bai 3: Input here</h3>
      <input type="text" placeholder="anything!" v-model="inputValue"><br>
      <p>You entered: {{ inputValue }}</p>
    </div>

    <div>
      <h3>Bai 4: Count by Increase Decrease</h3>
      <button @click="count++">Increase</button>
      <button @click="count--">Decrease</button>
      <p>Current count: {{ count }}</p>
    </div>
  </div>
  <div>
    <h1>V-For - Loop</h1>
    <table>
      <thead>
        <tr>
          <th># Count</th>
          <th>Ma</th>
          <th>Ten</th>
          <th>Tuoi</th>
          <th>Gioi tinh</th>
          <th>Dia chi</th>
        </tr>
      </thead>
      <tbody>
        <template v-for="(item, index) in listSV" :key="item.ma">
          <tr>
            <td>{{ index + 1 }}</td>
            <td>{{ item.ma }}</td>
            <td>{{ item.ten }}</td>
            <td>{{ item.tuoi }}</td>
            <td>{{ item.gioiTinh == true ? 'Nam' : 'Nu' }}</td>
            <td>{{ item.diaChi }}</td>
          </tr>
        </template>
      </tbody>
    </table>
  </div>
</template>

<script setup>
// Testing
const number = 3

const button = '<button>Click me</button>'

const table = `<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>John</td>
      <td>Doe</td>
      <td>@social</td>
    </tr>
  </tbody>
</table>`

// Data binding
function click() {
  alert('Button clicked')
}

const idButton = 'button'
const classButton = 'classs'


// Ref & Reactive 
import { ref } from 'vue'

const sinhVien = ref({
  ma: 'lbee2012',
  ten: 'Hoang Quy Long',
  tuoi: 10,
  gioiTinh: true,
  diaChi: 'Ha Noi'
})

const mayTinh = ref({
  ma: 'mt2012',
  ten: 'Acer Nitro 5 AN515-45',
  mauSac: 'Black',
  gia: 23000000,
  ngaySanXuat: '2022-01-01'
})

//v-model
const inputValue = ref('')

const count = ref(0)

const listSV = ref([
  { ma: 'lbee2012', ten: 'Long Hoang', tuoi: 18, gioiTinh: true, diaChi: 'Ha Noi'},
  { ma: 'anki2012', ten: 'Quizlet', tuoi: 18, gioiTinh: undefined, diaChi: 'In the sky'},
  { ma: 'luvy2012', ten: 'Khanh Ly', tuoi: 18, gioiTinh: false, diaChi: 'Ha Noi'},
  { ma: 'longbee', ten: 'toi la ai va ai la toi', tuoi: 18, gioiTinh: null, diaChi: 'In the sky'},
  { ma: 'beo', ten: 'Beo', tuoi: 18, gioiTinh: undefined, diaChi: 'Ha Noi'},
])
</script>

<style scoped>
h1 {
  text-align: center;
}
th, td {
  border: 1px solid;
  padding: 4px;
  margin: 4px;
}
</style>

<!-- Bai tap

1. Tao 1 bien ref cua doi tuong SV gom cac thuoc tinh
ma - String; ten - String; tuoi - Number; gioiTinh - Boolean, diaChi - String
va hien thi thong tin sv len giao dien

2. Tao 1 bien ref cua doi tuong MayTinh gom cac thuoc tinh
ma - String; ten - String; mauSac - String; gia - Number; ngaySanXuat - Date
va hien thi thong tin may tinh len giao dien

3. Tao 1 o input va 1 the /p
nhap gia tri vao o input va o duoi the p thi hien thi gia tri vua nhap

4. increase, decrease button
bam increase = +1
bam decrease = -1

5. array SV
ma - String; ten - String; tuoi - Number; gioiTinh - Boolean, diaChi - String
hien thi danh sach sv len giao dien
-->