.class public final synthetic Ll6/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ll6/e;

.field public final synthetic b:Lk6/a;


# direct methods
.method public synthetic constructor <init>(Ll6/e;Lk6/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll6/f;->a:Ll6/e;

    .line 5
    .line 6
    iput-object p2, p0, Ll6/f;->b:Lk6/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ll6/f;->a:Ll6/e;

    .line 2
    .line 3
    iget-object v1, p0, Ll6/f;->b:Lk6/a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ll6/e;->s(Lk6/a;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
