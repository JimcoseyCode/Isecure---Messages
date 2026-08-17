.class public final synthetic LW2/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:LW2/j;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LW2/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW2/h;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, LW2/h;->b:LW2/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LW2/h;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LW2/h;->b:LW2/j;

    .line 4
    .line 5
    invoke-static {v0, v1}, LW2/j;->d(Ljava/lang/Object;LW2/j;)Ljava/lang/Void;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
