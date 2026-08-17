.class public final LS/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS/c$a;
    }
.end annotation


# instance fields
.field private final a:LS/a;

.field private final b:LS/d;

.field private final c:LS/b;

.field private final d:I


# direct methods
.method constructor <init>(LS/a;LS/d;LS/b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS/c;->a:LS/a;

    .line 5
    .line 6
    iput-object p2, p0, LS/c;->b:LS/d;

    .line 7
    .line 8
    iput-object p3, p0, LS/c;->c:LS/b;

    .line 9
    .line 10
    iput p4, p0, LS/c;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, LS/c;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public b()LS/a;
    .locals 1

    .line 1
    iget-object v0, p0, LS/c;->a:LS/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()LS/b;
    .locals 1

    .line 1
    iget-object v0, p0, LS/c;->c:LS/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()LS/d;
    .locals 1

    .line 1
    iget-object v0, p0, LS/c;->b:LS/d;

    .line 2
    .line 3
    return-object v0
.end method
