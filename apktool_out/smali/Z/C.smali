.class public final synthetic LZ/C;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LH0/a;


# instance fields
.field public final synthetic a:LZ/S;

.field public final synthetic b:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(LZ/S;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ/C;->a:LZ/S;

    .line 5
    .line 6
    iput-object p2, p0, LZ/C;->b:Landroidx/concurrent/futures/c$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/C;->a:LZ/S;

    .line 2
    .line 3
    iget-object v1, p0, LZ/C;->b:Landroidx/concurrent/futures/c$a;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, LZ/S;->j(LZ/S;Landroidx/concurrent/futures/c$a;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
