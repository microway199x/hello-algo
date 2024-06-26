/**
 * File: Vertex.kt
 * Created Time: 2024-01-25
 * Author: curtishd (1023632660@qq.com)
 */

package utils

/* 頂點類別 */
class Vertex(val value: Int) {
    companion object {
        /* 輸入值串列 vals ，返回頂點串列 vets */
        fun valsToVets(vals: IntArray): Array<Vertex?> {
            val vets = arrayOfNulls<Vertex>(vals.size)
            for (i in vals.indices) {
                vets[i] = Vertex(vals[i])
            }
            return vets
        }

        /* 輸入頂點串列 vets ，返回值串列 vals */
        fun vetsToVals(vets: List<Vertex?>): List<Int> {
            val vals = ArrayList<Int>()
            for (vet in vets) {
                vals.add(vet!!.value)
            }
            return vals
        }
    }
}