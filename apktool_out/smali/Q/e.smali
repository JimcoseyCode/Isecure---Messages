.class public final synthetic LQ/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:LQ/o;

.field public final synthetic h:Ly/H;

.field public final synthetic i:Ljava/util/Map;

.field public final synthetic j:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(LQ/o;Ly/H;Ljava/util/Map;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ/e;->g:LQ/o;

    .line 5
    .line 6
    iput-object p2, p0, LQ/e;->h:Ly/H;

    .line 7
    .line 8
    iput-object p3, p0, LQ/e;->i:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, LQ/e;->j:Landroidx/concurrent/futures/c$a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LQ/e;->g:LQ/o;

    .line 2
    .line 3
    iget-object v1, p0, LQ/e;->h:Ly/H;

    .line 4
    .line 5
    iget-object v2, p0, LQ/e;->i:Ljava/util/Map;

    .line 6
    .line 7
    iget-object v3, p0, LQ/e;->j:Landroidx/concurrent/futures/c$a;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, LQ/o;->l(LQ/o;Ly/H;Ljava/util/Map;Landroidx/concurrent/futures/c$a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
