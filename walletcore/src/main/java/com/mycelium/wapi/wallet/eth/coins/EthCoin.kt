package com.mycelium.wapi.wallet.eth.coins

import com.mycelium.wapi.wallet.AddressUtils
import com.mycelium.wapi.wallet.GenericAddress
import com.mycelium.wapi.wallet.coins.CryptoCurrency
import com.mycelium.wapi.wallet.coins.families.Families
import com.mycelium.wapi.wallet.exceptions.AddressMalformedException

abstract class EthCoin: CryptoCurrency(){
    init {
        family = Families.ETHEREUM
    }

    @Throws(AddressMalformedException::class)
    override fun newAddress(addressStr: String): GenericAddress {
        return AddressUtils.from(this, addressStr)
    }
    override fun getSymbol() = "ETH"
    override fun getUnitExponent(): Int {
        return 2
    }
}

object EthMain : EthCoin() {
    init {
        id = "ETH-Main"
    }
}


object EthTest : EthCoin() {
    init {
        id = "ETH-Test"
    }
}