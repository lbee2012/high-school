<template>
    <h1>Quan ly Sach</h1>
    <FormSachComponent />
    <button type="button" class="btn btn-primary" @click="addSach()">Add</button>
    <button type="button" class="btn btn-success" @click="updateSach()">Update</button>

    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Ten</th>
                <th scope="col">Loai</th>
                <th scope="col">Tac gia</th>
                <th scope="col">Gia</th>
                <th scope="col">Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <template v-for="(item, index) in listSach" :key="item.id">
                <tr>
                    <td>{{ index++ }}</td>
                    <td>{{ item.ten }}</td>
                    <td>{{ item.loai }}</td>
                    <td>{{ item.tacGia }}</td>
                    <td>{{ item.gia }}</td>
                    <td>
                        <button type="button" class="btn btn-danger" @click="deleteSach(index)">Delete</button>
                        <button type="button" class="btn btn-warning" @click="detailSach(item)">Detail</button>
                    </td>
                </tr>
            </template>
        </tbody>
    </table>
</template>

<script setup>
import FormSachComponent from '@/components/FormSachComponent.vue';
import { ref } from 'vue';

const listSach = ref ([
    { ten: 's1', loai: 'l1', tacGia: 'tg1', gia: 1, id: 1},
    { ten: 's2', loai: 'l2', tacGia: 'tg2', gia: 2, id: 2},
    { ten: 's3', loai: 'l3', tacGia: 'tg3', gia: 3, id: 3},
    { ten: 's4', loai: 'l4', tacGia: 'tg4', gia: 4, id: 4},
    { ten: 's5', loai: 'l5', tacGia: 'tg5', gia: 5, id: 5},
])


</script>

<style scoped>

</style>