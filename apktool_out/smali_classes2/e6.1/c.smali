.class public abstract Le6/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static a(Le6/b;)Le6/a;
    .locals 2

    .line 1
    const-string v0, "You must provide a valid BarcodeScannerOptions."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lr4/i;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lc6/i;->c()Lc6/i;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-class v1, Lh6/f;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lc6/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lh6/f;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lh6/f;->a(Le6/b;)Lh6/g;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
