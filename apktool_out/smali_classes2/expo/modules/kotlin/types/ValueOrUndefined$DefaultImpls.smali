.class public final Lexpo/modules/kotlin/types/ValueOrUndefined$DefaultImpls;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/kotlin/types/ValueOrUndefined;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static getOptional(Lexpo/modules/kotlin/types/ValueOrUndefined;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/types/ValueOrUndefined<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    .line 6
    .line 7
    invoke-virtual {p0}, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of p0, p0, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Li7/m;

    .line 19
    .line 20
    invoke-direct {p0}, Li7/m;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public static isUndefined(Lexpo/modules/kotlin/types/ValueOrUndefined;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/types/ValueOrUndefined<",
            "TT;>;)Z"
        }
    .end annotation

    .line 1
    instance-of p0, p0, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    .line 2
    .line 3
    return p0
.end method
