.class public final synthetic Lq5/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LC5/b;


# instance fields
.field public final synthetic a:Lq5/n;

.field public final synthetic b:Lq5/c;


# direct methods
.method public synthetic constructor <init>(Lq5/n;Lq5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq5/k;->a:Lq5/n;

    .line 5
    .line 6
    iput-object p2, p0, Lq5/k;->b:Lq5/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lq5/k;->a:Lq5/n;

    .line 2
    .line 3
    iget-object v1, p0, Lq5/k;->b:Lq5/c;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lq5/n;->h(Lq5/n;Lq5/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
