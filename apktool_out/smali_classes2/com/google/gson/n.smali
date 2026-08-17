.class public abstract Lcom/google/gson/n;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/gson/n;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/gson/n$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/gson/n$a;-><init>(Lcom/google/gson/n;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public abstract b(LS5/a;)Ljava/lang/Object;
.end method

.method public final c(Ljava/lang/Object;)Lcom/google/gson/f;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, LO5/e;

    .line 2
    .line 3
    invoke-direct {v0}, LO5/e;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, Lcom/google/gson/n;->d(LS5/c;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, LO5/e;->N0()Lcom/google/gson/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object p1

    .line 14
    :catch_0
    move-exception p1

    .line 15
    new-instance v0, Lcom/google/gson/g;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lcom/google/gson/g;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public abstract d(LS5/c;Ljava/lang/Object;)V
.end method
