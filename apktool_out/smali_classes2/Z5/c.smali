.class public final synthetic LZ5/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lq5/g;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lq5/d;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-class v0, Lb6/c$a;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lq5/d;->g(Ljava/lang/Class;)Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Lb6/c;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lb6/c;-><init>(Ljava/util/Set;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
