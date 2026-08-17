.class public final LB1/x$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/o;
.implements LB1/x$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB1/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/ContentResolver;

.field private final b:Z


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB1/x$a;->a:Landroid/content/ContentResolver;

    .line 5
    .line 6
    iput-boolean p2, p0, LB1/x$a;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Lcom/bumptech/glide/load/data/d;
    .locals 3

    .line 1
    new-instance v0, Lcom/bumptech/glide/load/data/a;

    .line 2
    .line 3
    iget-object v1, p0, LB1/x$a;->a:Landroid/content/ContentResolver;

    .line 4
    .line 5
    iget-boolean v2, p0, LB1/x$a;->b:Z

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, v2}, Lcom/bumptech/glide/load/data/a;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Z)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public build(LB1/r;)LB1/n;
    .locals 0

    .line 1
    new-instance p1, LB1/x;

    .line 2
    .line 3
    invoke-direct {p1, p0}, LB1/x;-><init>(LB1/x$c;)V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public teardown()V
    .locals 0

    .line 1
    return-void
.end method
