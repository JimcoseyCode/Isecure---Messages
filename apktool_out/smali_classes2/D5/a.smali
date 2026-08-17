.class public final synthetic LD5/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LC5/b;


# instance fields
.field public final synthetic a:Ln5/e;


# direct methods
.method public synthetic constructor <init>(Ln5/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD5/a;->a:Ln5/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LD5/a;->a:Ln5/e;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/firebase/installations/c;->e(Ln5/e;)LE5/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
