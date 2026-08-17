.class public final synthetic LQ/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:LQ/o;

.field public final synthetic b:Ly/H;

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(LQ/o;Ly/H;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ/l;->a:LQ/o;

    .line 5
    .line 6
    iput-object p2, p0, LQ/l;->b:Ly/H;

    .line 7
    .line 8
    iput-object p3, p0, LQ/l;->c:Ljava/util/Map;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LQ/l;->a:LQ/o;

    .line 2
    .line 3
    iget-object v1, p0, LQ/l;->b:Ly/H;

    .line 4
    .line 5
    iget-object v2, p0, LQ/l;->c:Ljava/util/Map;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, LQ/o;->m(LQ/o;Ly/H;Ljava/util/Map;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
