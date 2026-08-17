.class public abstract LN5/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN5/l$a;
    }
.end annotation


# direct methods
.method public static a(Lcom/google/gson/f;LS5/c;)V
    .locals 1

    .line 1
    sget-object v0, LO5/l;->X:Lcom/google/gson/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p0}, Lcom/google/gson/n;->d(LS5/c;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static b(Ljava/lang/Appendable;)Ljava/io/Writer;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/io/Writer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/io/Writer;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, LN5/l$a;

    .line 9
    .line 10
    invoke-direct {v0, p0}, LN5/l$a;-><init>(Ljava/lang/Appendable;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
